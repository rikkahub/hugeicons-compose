package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WalletNotFound01: ImageVector
    get() {
        if (_walletNotFound01 != null) {
            return _walletNotFound01!!
        }
        _walletNotFound01 = ImageVector.Builder(
            name = "WalletNotFound01",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6.99991f)
        horizontalLineTo(5f)
        curveTo(3.89543f, 6.99991f, 3f, 6.10448f, 3f, 4.99991f)
        curveTo(3f, 4.44762f, 3.22386f, 3.94762f, 3.58579f, 3.58569f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0002f, 12f)
        horizontalLineTo(19.0002f)
        curveTo(18.5352f, 12f, 18.3027f, 12f, 18.1119f, 12.0511f)
        curveTo(17.5943f, 12.1898f, 17.19f, 12.5941f, 17.0513f, 13.1118f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 7f, 19.2426f, 7f, 20.1213f, 7.87868f)
        curveTo(21f, 8.75736f, 21f, 10.1716f, 21f, 13f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5f)
        verticalLineTo(15f)
        curveTo(3f, 17.8284f, 3f, 19.2426f, 3.87868f, 20.1213f)
        curveTo(4.75736f, 21f, 6.17157f, 21f, 9f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 3f)
        horizontalLineTo(14f)
        curveTo(14.93f, 3f, 15.395f, 3f, 15.7765f, 3.10222f)
        curveTo(16.8117f, 3.37962f, 17.6204f, 4.18827f, 17.8978f, 5.22354f)
        curveTo(18f, 5.60504f, 18f, 6.07003f, 18f, 7f)
        }
        }.build()

        return _walletNotFound01!!
    }

private var _walletNotFound01: ImageVector? = null
