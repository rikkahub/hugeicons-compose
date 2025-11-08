package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WalletNotFound02: ImageVector
    get() {
        if (_walletNotFound02 != null) {
            return _walletNotFound02!!
        }
        _walletNotFound02 = ImageVector.Builder(
            name = "WalletNotFound02",
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
        moveTo(12.5f, 8.5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 8.5f, 19.2426f, 8.5f, 20.1213f, 9.37868f)
        curveTo(21f, 10.2574f, 21f, 11.6716f, 21f, 14.5f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8.5f)
        horizontalLineTo(3f)
        verticalLineTo(15.5f)
        curveTo(3f, 18.3284f, 3f, 19.7426f, 3.87868f, 20.6213f)
        curveTo(4.75736f, 21.5f, 6.17157f, 21.5f, 9f, 21.5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 21.5f, 19.2426f, 21.5f, 20.1213f, 20.6213f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9998f, 8.5f)
        verticalLineTo(4.11803f)
        curveTo(14.9998f, 3.22442f, 14.2754f, 2.5f, 13.3818f, 2.5f)
        curveTo(13.1306f, 2.5f, 12.8829f, 2.55848f, 12.6582f, 2.67082f)
        lineTo(8.6665f, 4.66667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8.5f)
        curveTo(3f, 7.88713f, 3.34626f, 7.32687f, 3.89443f, 7.05279f)
        lineTo(6f, 6f)
        }
        }.build()

        return _walletNotFound02!!
    }

private var _walletNotFound02: ImageVector? = null
