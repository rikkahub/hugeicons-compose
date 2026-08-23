package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiZero: ImageVector
    get() {
        if (_wifiZero != null) {
            return _wifiZero!!
        }
        _wifiZero = ImageVector.Builder(
            name = "WifiZero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.125f, 19.25f)
            horizontalLineTo(12f)
            moveTo(12.25f, 19.25f)
            curveTo(12.25f, 19.3881f, 12.1381f, 19.5f, 12f, 19.5f)
            curveTo(11.8619f, 19.5f, 11.75f, 19.3881f, 11.75f, 19.25f)
            curveTo(11.75f, 19.1119f, 11.8619f, 19f, 12f, 19f)
            curveTo(12.1381f, 19f, 12.25f, 19.1119f, 12.25f, 19.25f)
            close()
        }
        }.build()

        return _wifiZero!!
    }

private var _wifiZero: ImageVector? = null
