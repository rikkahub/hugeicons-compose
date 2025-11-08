package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WalletAdd01: ImageVector
    get() {
        if (_walletAdd01 != null) {
            return _walletAdd01!!
        }
        _walletAdd01 = ImageVector.Builder(
            name = "WalletAdd01",
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
        moveTo(14f, 3f)
        horizontalLineTo(5f)
        curveTo(3.89543f, 3f, 3f, 3.89543f, 3f, 5f)
        curveTo(3f, 6.10457f, 3.89543f, 7f, 5f, 7f)
        horizontalLineTo(18f)
        curveTo(18f, 6.07003f, 18f, 5.60504f, 17.8978f, 5.22354f)
        curveTo(17.6204f, 4.18827f, 16.8117f, 3.37962f, 15.7765f, 3.10222f)
        curveTo(15.395f, 3f, 14.93f, 3f, 14f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 21f, 19.2426f, 21f, 20.1213f, 20.1213f)
        curveTo(21f, 19.2426f, 21f, 17.8284f, 21f, 15f)
        verticalLineTo(13f)
        curveTo(21f, 10.1716f, 21f, 8.75736f, 20.1213f, 7.87868f)
        curveTo(19.2426f, 7f, 17.8284f, 7f, 15f, 7f)
        horizontalLineTo(7f)
        moveTo(3f, 12f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        horizontalLineTo(19f)
        curveTo(18.535f, 12f, 18.3025f, 12f, 18.1118f, 12.0511f)
        curveTo(17.5941f, 12.1898f, 17.1898f, 12.5941f, 17.0511f, 13.1118f)
        curveTo(17f, 13.3025f, 17f, 13.535f, 17f, 14f)
        curveTo(17f, 14.465f, 17f, 14.6975f, 17.0511f, 14.8882f)
        curveTo(17.1898f, 15.4059f, 17.5941f, 15.8102f, 18.1118f, 15.9489f)
        curveTo(18.3025f, 16f, 18.535f, 16f, 19f, 16f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17.5f)
        horizontalLineTo(6.5f)
        moveTo(6.5f, 17.5f)
        horizontalLineTo(3f)
        moveTo(6.5f, 17.5f)
        verticalLineTo(14f)
        moveTo(6.5f, 17.5f)
        verticalLineTo(21f)
        }
        }.build()

        return _walletAdd01!!
    }

private var _walletAdd01: ImageVector? = null
