package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiUnlock: ImageVector
    get() {
        if (_wifiUnlock != null) {
            return _wifiUnlock!!
        }
        _wifiUnlock = ImageVector.Builder(
            name = "WifiUnlock",
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
        moveTo(8.5f, 15.5f)
        curveTo(9.76795f, 14.2321f, 11.4378f, 13.7679f, 13f, 14.1077f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 12f)
        curveTo(8.67327f, 8.85033f, 12.1221f, 8.16715f, 15.5f, 10.0149f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        curveTo(8.31579f, 2.66669f, 15.6842f, 2.66668f, 22f, 7.99989f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5312f, 15.36f)
        verticalLineTo(13.9523f)
        curveTo(16.5312f, 12.8741f, 17.4127f, 12f, 18.5f, 12f)
        curveTo(18.9887f, 12f, 19.4359f, 12.1766f, 19.7801f, 12.469f)
        moveTo(17.8437f, 21f)
        horizontalLineTo(19.1563f)
        curveTo(20.1777f, 21f, 20.6884f, 21f, 21.0749f, 20.7951f)
        curveTo(21.3802f, 20.6333f, 21.6302f, 20.3854f, 21.7934f, 20.0827f)
        curveTo(22f, 19.6993f, 22f, 19.1929f, 22f, 18.18f)
        curveTo(22f, 17.1671f, 22f, 16.6607f, 21.7934f, 16.2773f)
        curveTo(21.6302f, 15.9746f, 21.3802f, 15.7267f, 21.0749f, 15.5649f)
        curveTo(20.6884f, 15.36f, 20.1777f, 15.36f, 19.1563f, 15.36f)
        horizontalLineTo(17.8437f)
        curveTo(16.8223f, 15.36f, 16.3116f, 15.36f, 15.9251f, 15.5649f)
        curveTo(15.6198f, 15.7267f, 15.3698f, 15.9746f, 15.2066f, 16.2773f)
        curveTo(15f, 16.6607f, 15f, 17.1671f, 15f, 18.18f)
        curveTo(15f, 19.1929f, 15f, 19.6993f, 15.2066f, 20.0827f)
        curveTo(15.3698f, 20.3854f, 15.6198f, 20.6333f, 15.9251f, 20.7951f)
        curveTo(16.3116f, 21f, 16.8223f, 21f, 17.8437f, 21f)
        }
        }.build()

        return _wifiUnlock!!
    }

private var _wifiUnlock: ImageVector? = null
