package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CallMissed01: ImageVector
    get() {
        if (_callMissed01 != null) {
            return _callMissed01!!
        }
        _callMissed01 = ImageVector.Builder(
            name = "CallMissed01",
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
        moveTo(4.91186f, 10.5413f)
        lineTo(7.55229f, 7.90088f)
        curveTo(8.09091f, 7.36227f, 8.27728f, 6.56642f, 8.05944f, 5.83652f)
        curveTo(7.8891f, 5.26577f, 7.69718f, 4.57964f, 7.56961f, 3.99292f)
        curveTo(7.45162f, 3.45027f, 6.97545f, 3f, 6.42012f, 3f)
        horizontalLineTo(4.91186f)
        curveTo(3.8012f, 3f, 2.88911f, 3.90384f, 3.01094f, 5.0078f)
        curveTo(3.93709f, 13.3996f, 10.6004f, 20.0629f, 18.9922f, 20.9891f)
        curveTo(20.0962f, 21.1109f, 21f, 20.1988f, 21f, 19.0881f)
        verticalLineTo(17.5799f)
        curveTo(21f, 17.0246f, 20.5479f, 16.569f, 20.0015f, 16.4696f)
        curveTo(19.3988f, 16.36f, 18.7611f, 16.1804f, 18.2276f, 16.0103f)
        curveTo(17.4611f, 15.7659f, 16.6091f, 15.9377f, 16.0403f, 16.5065f)
        lineTo(13.4587f, 19.0881f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4887f, 5.48869f)
        lineTo(15.6464f, 8.64645f)
        curveTo(15.8728f, 8.87282f, 16.1799f, 9f, 16.5f, 9f)
        curveTo(16.8201f, 9f, 17.1272f, 8.87282f, 17.3536f, 8.64645f)
        lineTo(21f, 5f)
        moveTo(12.2072f, 8.5f)
        curveTo(12.1307f, 7.62126f, 11.7742f, 5.66718f, 12.2207f, 5.22067f)
        curveTo(12.6672f, 4.77415f, 14.6213f, 5.13074f, 15.5f, 5.2072f)
        }
        }.build()

        return _callMissed01!!
    }

private var _callMissed01: ImageVector? = null
