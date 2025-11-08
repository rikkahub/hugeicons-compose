package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CallBlocked: ImageVector
    get() {
        if (_callBlocked != null) {
            return _callBlocked!!
        }
        _callBlocked = ImageVector.Builder(
            name = "CallBlocked",
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
        moveTo(14.0251f, 9.97486f)
        curveTo(14.6585f, 10.6082f, 15.5335f, 11f, 16.5f, 11f)
        curveTo(18.433f, 11f, 20f, 9.43293f, 20f, 7.5f)
        curveTo(20f, 6.5335f, 19.6083f, 5.6585f, 18.9749f, 5.02512f)
        moveTo(14.0251f, 9.97486f)
        curveTo(13.3918f, 9.34148f, 13f, 8.46647f, 13f, 7.5f)
        curveTo(13f, 5.567f, 14.567f, 4f, 16.5f, 4f)
        curveTo(17.4665f, 4f, 18.3415f, 4.39175f, 18.9749f, 5.02512f)
        moveTo(14.0251f, 9.97486f)
        lineTo(18.9749f, 5.02512f)
        }
        }.build()

        return _callBlocked!!
    }

private var _callBlocked: ImageVector? = null
