package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = ImageVector.Builder(
            name = "Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        curveTo(2f, 8f, 6.47715f, 3f, 12f, 3f)
        curveTo(17.5228f, 3f, 22f, 8f, 22f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.544f, 13.045f)
        curveTo(21.848f, 13.4713f, 22f, 13.6845f, 22f, 14f)
        curveTo(22f, 14.3155f, 21.848f, 14.5287f, 21.544f, 14.955f)
        curveTo(20.1779f, 16.8706f, 16.6892f, 21f, 12f, 21f)
        curveTo(7.31078f, 21f, 3.8221f, 16.8706f, 2.45604f, 14.955f)
        curveTo(2.15201f, 14.5287f, 2f, 14.3155f, 2f, 14f)
        curveTo(2f, 13.6845f, 2.15201f, 13.4713f, 2.45604f, 13.045f)
        curveTo(3.8221f, 11.1294f, 7.31078f, 7f, 12f, 7f)
        curveTo(16.6892f, 7f, 20.1779f, 11.1294f, 21.544f, 13.045f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        curveTo(15f, 12.3431f, 13.6569f, 11f, 12f, 11f)
        curveTo(10.3431f, 11f, 9f, 12.3431f, 9f, 14f)
        curveTo(9f, 15.6569f, 10.3431f, 17f, 12f, 17f)
        curveTo(13.6569f, 17f, 15f, 15.6569f, 15f, 14f)
        }
        }.build()

        return _eye!!
    }

private var _eye: ImageVector? = null
