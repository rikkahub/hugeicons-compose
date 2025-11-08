package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wallet02: ImageVector
    get() {
        if (_wallet02 != null) {
            return _wallet02!!
        }
        _wallet02 = ImageVector.Builder(
            name = "Wallet02",
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
        moveTo(13f, 3.5f)
        horizontalLineTo(14f)
        curveTo(14.93f, 3.5f, 15.395f, 3.5f, 15.7765f, 3.60222f)
        curveTo(16.8117f, 3.87962f, 17.6204f, 4.68827f, 17.8978f, 5.72354f)
        curveTo(18f, 6.10504f, 18f, 6.57003f, 18f, 7.5f)
        horizontalLineTo(5f)
        curveTo(3.89543f, 7.5f, 3f, 6.60457f, 3f, 5.5f)
        curveTo(3f, 4.39543f, 3.89543f, 3.5f, 5f, 3.5f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.5f)
        verticalLineTo(15.5f)
        curveTo(3f, 18.3284f, 3f, 19.7426f, 3.87868f, 20.6213f)
        curveTo(4.75736f, 21.5f, 6.17157f, 21.5f, 9f, 21.5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 21.5f, 19.2426f, 21.5f, 20.1213f, 20.6213f)
        curveTo(21f, 19.7426f, 21f, 18.3284f, 21f, 15.5f)
        verticalLineTo(13.5f)
        curveTo(21f, 10.6716f, 21f, 9.25736f, 20.1213f, 8.37868f)
        curveTo(19.2426f, 7.5f, 17.8284f, 7.5f, 15f, 7.5f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.5f)
        horizontalLineTo(19f)
        curveTo(18.535f, 12.5f, 18.3025f, 12.5f, 18.1118f, 12.5511f)
        curveTo(17.5941f, 12.6898f, 17.1898f, 13.0941f, 17.0511f, 13.6118f)
        curveTo(17f, 13.8025f, 17f, 14.035f, 17f, 14.5f)
        curveTo(17f, 14.965f, 17f, 15.1975f, 17.0511f, 15.3882f)
        curveTo(17.1898f, 15.9059f, 17.5941f, 16.3102f, 18.1118f, 16.4489f)
        curveTo(18.3025f, 16.5f, 18.535f, 16.5f, 19f, 16.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 2.5f)
        curveTo(12.433f, 2.5f, 14f, 4.067f, 14f, 6f)
        curveTo(14f, 6.5368f, 13.8792f, 7.04537f, 13.6632f, 7.5f)
        horizontalLineTo(7.33682f)
        curveTo(7.12085f, 7.04537f, 7f, 6.5368f, 7f, 6f)
        curveTo(7f, 4.067f, 8.567f, 2.5f, 10.5f, 2.5f)
        }
        }.build()

        return _wallet02!!
    }

private var _wallet02: ImageVector? = null
