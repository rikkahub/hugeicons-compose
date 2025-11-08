package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WalletDone02: ImageVector
    get() {
        if (_walletDone02 != null) {
            return _walletDone02!!
        }
        _walletDone02 = ImageVector.Builder(
            name = "WalletDone02",
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
        moveTo(11f, 21.5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 21.5f, 19.2426f, 21.5f, 20.1213f, 20.6213f)
        curveTo(21f, 19.7426f, 21f, 18.3284f, 21f, 15.5f)
        verticalLineTo(14.5f)
        curveTo(21f, 11.6716f, 21f, 10.2574f, 20.1213f, 9.37868f)
        curveTo(19.2426f, 8.5f, 17.8284f, 8.5f, 15f, 8.5f)
        horizontalLineTo(3f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8.49833f)
        verticalLineTo(4.1103f)
        curveTo(15f, 3.22096f, 14.279f, 2.5f, 13.3897f, 2.5f)
        curveTo(13.1336f, 2.5f, 12.8812f, 2.56108f, 12.6534f, 2.67818f)
        lineTo(3.7623f, 7.24927f)
        curveTo(3.29424f, 7.48991f, 3f, 7.97203f, 3f, 8.49833f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 15.5f)
        curveTo(17.7761f, 15.5f, 18f, 15.2761f, 18f, 15f)
        curveTo(18f, 14.7239f, 17.7761f, 14.5f, 17.5f, 14.5f)
        moveTo(17.5f, 15.5f)
        curveTo(17.2239f, 15.5f, 17f, 15.2761f, 17f, 15f)
        curveTo(17f, 14.7239f, 17.2239f, 14.5f, 17.5f, 14.5f)
        moveTo(17.5f, 15.5f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 19.5f)
        curveTo(3f, 19.5f, 4f, 19.5f, 5f, 21.5f)
        curveTo(5f, 21.5f, 8.17647f, 16.5f, 11f, 15.5f)
        }
        }.build()

        return _walletDone02!!
    }

private var _walletDone02: ImageVector? = null
