package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse07: ImageVector
    get() {
        if (_mouse07 != null) {
            return _mouse07!!
        }
        _mouse07 = ImageVector.Builder(
            name = "Mouse07",
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
        moveTo(5f, 2f)
        curveTo(5f, 2.82843f, 5.67157f, 3.5f, 6.5f, 3.5f)
        lineTo(9f, 3.5f)
        curveTo(10.8856f, 3.5f, 11.8284f, 3.5f, 12.4142f, 4.08579f)
        curveTo(12.8183f, 4.48987f, 12.9436f, 5.06385f, 12.9825f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.19248f, 18.0711f)
        curveTo(7.34438f, 19.9843f, 8.85933f, 21.6088f, 10.812f, 21.8495f)
        curveTo(11.5301f, 21.9379f, 12.2601f, 22f, 13f, 22f)
        curveTo(13.7398f, 22f, 14.4699f, 21.9379f, 15.1879f, 21.8495f)
        curveTo(17.1407f, 21.6088f, 18.6555f, 19.9843f, 18.8074f, 18.0711f)
        curveTo(18.9128f, 16.7453f, 19f, 15.3856f, 19f, 14f)
        curveTo(19f, 12.6144f, 18.9128f, 11.2547f, 18.8074f, 9.92895f)
        curveTo(18.6555f, 8.01572f, 17.1407f, 6.39115f, 15.1879f, 6.15056f)
        curveTo(14.4699f, 6.06209f, 13.7398f, 6f, 13f, 6f)
        curveTo(12.2601f, 6f, 11.5301f, 6.06209f, 10.812f, 6.15056f)
        curveTo(8.85933f, 6.39115f, 7.34438f, 8.01572f, 7.19248f, 9.92895f)
        curveTo(7.08722f, 11.2547f, 7f, 12.6144f, 7f, 14f)
        curveTo(7f, 15.3856f, 7.08722f, 16.7453f, 7.19248f, 18.0711f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        verticalLineTo(11f)
        }
        }.build()

        return _mouse07!!
    }

private var _mouse07: ImageVector? = null
