package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiError01: ImageVector
    get() {
        if (_wifiError01 != null) {
            return _wifiError01!!
        }
        _wifiError01 = ImageVector.Builder(
            name = "WifiError01",
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
        moveTo(18.5f, 9.99761f)
        curveTo(14.7324f, 6.66535f, 9.5f, 6.66535f, 5.5f, 9.99761f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 6.9986f)
        curveTo(8.31579f, 1.66699f, 15.6842f, 1.66698f, 22f, 6.99849f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9933f, 14.9853f)
        verticalLineTo(16.4964f)
        moveTo(11.9933f, 18.4673f)
        verticalLineTo(18.4984f)
        moveTo(12.1444f, 12.0075f)
        curveTo(12.4933f, 11.9942f, 13.375f, 12.163f, 14.2349f, 13.6825f)
        lineTo(16.3884f, 17.3742f)
        curveTo(17.2109f, 18.5922f, 17.6154f, 20.7778f, 14.5873f, 20.9418f)
        lineTo(12f, 21.0002f)
        lineTo(9.3841f, 20.926f)
        curveTo(6.35606f, 20.7621f, 6.82207f, 18.5938f, 7.58302f, 17.3585f)
        lineTo(9.73652f, 13.6667f)
        curveTo(10.5964f, 12.1473f, 11.4781f, 11.9784f, 11.8271f, 11.9918f)
        lineTo(12.1444f, 12.0075f)
        }
        }.build()

        return _wifiError01!!
    }

private var _wifiError01: ImageVector? = null
