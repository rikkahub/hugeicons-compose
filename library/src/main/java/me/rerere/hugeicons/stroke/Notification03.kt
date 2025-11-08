package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notification03: ImageVector
    get() {
        if (_notification03 != null) {
            return _notification03!!
        }
        _notification03 = ImageVector.Builder(
            name = "Notification03",
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
        moveTo(20f, 18.5011f)
        lineTo(18.349f, 7.93407f)
        curveTo(17.8603f, 4.80601f, 15.166f, 2.5f, 12f, 2.5f)
        curveTo(8.83398f, 2.5f, 6.13971f, 4.80601f, 5.65098f, 7.93407f)
        lineTo(4f, 18.5011f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18.5f)
        curveTo(20f, 16.8431f, 16.4183f, 15.5f, 12f, 15.5f)
        curveTo(7.58172f, 15.5f, 4f, 16.8431f, 4f, 18.5f)
        curveTo(4f, 20.1569f, 7.58172f, 21.5f, 12f, 21.5f)
        curveTo(16.4183f, 21.5f, 20f, 20.1569f, 20f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 18.5f)
        horizontalLineTo(11f)
        }
        }.build()

        return _notification03!!
    }

private var _notification03: ImageVector? = null
