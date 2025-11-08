package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Knowledge01: ImageVector
    get() {
        if (_knowledge01 != null) {
            return _knowledge01!!
        }
        _knowledge01 = ImageVector.Builder(
            name = "Knowledge01",
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
        moveTo(20.9998f, 16f)
        horizontalLineTo(4.89113f)
        curveTo(4.40355f, 16f, 4.0423f, 16.1723f, 3.75757f, 16.4515f)
        curveTo(3.28913f, 16.9108f, 3.12083f, 17.5901f, 3.04657f, 18.2429f)
        curveTo(2.96065f, 18.9982f, 2.99167f, 19.6886f, 3.20248f, 20.4377f)
        curveTo(3.43762f, 21.2734f, 4.02149f, 22f, 4.88667f, 22f)
        horizontalLineTo(20.9998f)
        moveTo(19.4061f, 22f)
        curveTo(17.8674f, 20.5885f, 17.2354f, 18.1421f, 19.4061f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.8176f, 6.5f)
        curveTo(11.8176f, 4f, 9.10929f, 3f, 9.10929f, 3f)
        moveTo(11.8176f, 6.92131f)
        curveTo(11.8176f, 6.92131f, 5.85938f, 3.85577f, 5.85938f, 8.90819f)
        curveTo(5.85938f, 13.9606f, 8.57044f, 16f, 9.65094f, 16f)
        curveTo(10.5128f, 16f, 11.0212f, 14.9913f, 11.8176f, 14.9913f)
        curveTo(12.6139f, 14.9913f, 12.9008f, 16f, 13.9841f, 16f)
        curveTo(15.0647f, 16f, 17.7757f, 13.9606f, 17.7757f, 8.90819f)
        curveTo(17.7757f, 3.85578f, 11.8176f, 6.92131f, 11.8176f, 6.92131f)
        moveTo(12.3593f, 6f)
        curveTo(12.3593f, 2.01035f, 14.3103f, 3f, 15.2858f, 2f)
        curveTo(16.2614f, 4.5f, 14.9556f, 5.00259f, 12.3593f, 6f)
        }
        }.build()

        return _knowledge01!!
    }

private var _knowledge01: ImageVector? = null
