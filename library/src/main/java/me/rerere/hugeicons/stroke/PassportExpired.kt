package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PassportExpired: ImageVector
    get() {
        if (_passportExpired != null) {
            return _passportExpired!!
        }
        _passportExpired = ImageVector.Builder(
            name = "PassportExpired",
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
        moveTo(22f, 11f)
        verticalLineTo(13f)
        curveTo(22f, 17.2426f, 22f, 19.364f, 20.5355f, 20.682f)
        curveTo(19.0711f, 22f, 16.714f, 22f, 12f, 22f)
        curveTo(7.28595f, 22f, 4.92893f, 22f, 3.46447f, 20.682f)
        curveTo(2f, 19.364f, 2f, 17.2426f, 2f, 13f)
        curveTo(2f, 8.75736f, 2f, 6.63604f, 3.46447f, 5.31802f)
        curveTo(4.92893f, 4f, 7.28595f, 4f, 12f, 4f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17.5f)
        curveTo(6.20831f, 14.9189f, 10.7122f, 14.7491f, 12f, 17.5f)
        moveTo(10.5f, 10.5f)
        curveTo(10.5f, 11.6046f, 9.60457f, 12.5f, 8.5f, 12.5f)
        curveTo(7.39543f, 12.5f, 6.5f, 11.6046f, 6.5f, 10.5f)
        curveTo(6.5f, 9.39543f, 7.39543f, 8.5f, 8.5f, 8.5f)
        curveTo(9.60457f, 8.5f, 10.5f, 9.39543f, 10.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        lineTo(19f, 5f)
        moveTo(19f, 5f)
        lineTo(22f, 8f)
        moveTo(19f, 5f)
        lineTo(16f, 8f)
        moveTo(19f, 5f)
        lineTo(22f, 2f)
        }
        }.build()

        return _passportExpired!!
    }

private var _passportExpired: ImageVector? = null
