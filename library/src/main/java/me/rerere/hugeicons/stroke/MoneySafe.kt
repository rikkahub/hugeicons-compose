package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneySafe: ImageVector
    get() {
        if (_moneySafe != null) {
            return _moneySafe!!
        }
        _moneySafe = ImageVector.Builder(
            name = "MoneySafe",
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
        moveTo(13f, 2f)
        horizontalLineTo(11f)
        curveTo(6.75736f, 2f, 4.63604f, 2f, 3.31802f, 3.31802f)
        curveTo(2f, 4.63604f, 2f, 6.75736f, 2f, 11f)
        curveTo(2f, 15.2426f, 2f, 17.364f, 3.31802f, 18.682f)
        curveTo(4.63604f, 20f, 6.75736f, 20f, 11f, 20f)
        horizontalLineTo(13f)
        curveTo(17.2426f, 20f, 19.364f, 20f, 20.682f, 18.682f)
        curveTo(22f, 17.364f, 22f, 15.2426f, 22f, 11f)
        curveTo(22f, 6.75736f, 22f, 4.63604f, 20.682f, 3.31802f)
        curveTo(19.364f, 2f, 17.2426f, 2f, 13f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 15f)
        curveTo(18f, 14.4692f, 18f, 13.6148f, 18f, 11.9062f)
        verticalLineTo(10.0938f)
        curveTo(18f, 8.38516f, 18f, 7.53082f, 17f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 22f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 22f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49983f, 13f)
        curveTo(10.6158f, 13f, 11.5205f, 12.1046f, 11.5205f, 11f)
        curveTo(11.5205f, 9.89543f, 10.6158f, 9f, 9.49983f, 9f)
        moveTo(9.49983f, 13f)
        curveTo(8.38384f, 13f, 7.47914f, 12.1046f, 7.47914f, 11f)
        curveTo(7.47914f, 9.89543f, 8.38384f, 9f, 9.49983f, 9f)
        moveTo(9.49983f, 13f)
        verticalLineTo(15f)
        moveTo(9.49983f, 9f)
        verticalLineTo(7f)
        moveTo(7.74987f, 12f)
        lineTo(5.9999f, 13f)
        moveTo(12.9998f, 9f)
        lineTo(11.2498f, 10f)
        moveTo(11.2499f, 12f)
        lineTo(12.9999f, 13f)
        moveTo(6f, 9f)
        lineTo(7.74997f, 10f)
        }
        }.build()

        return _moneySafe!!
    }

private var _moneySafe: ImageVector? = null
