package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiFile: ImageVector
    get() {
        if (_aiFile != null) {
            return _aiFile!!
        }
        _aiFile = ImageVector.Builder(
            name = "AiFile",
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
        moveTo(19f, 12.001f)
        verticalLineTo(10.6578f)
        curveTo(19f, 9.84033f, 19f, 9.43158f, 18.8478f, 9.06404f)
        curveTo(18.6955f, 8.69649f, 18.4065f, 8.40746f, 17.8284f, 7.8294f)
        lineTo(13.0919f, 3.09286f)
        curveTo(12.593f, 2.59397f, 12.3436f, 2.34453f, 12.0345f, 2.19672f)
        curveTo(11.9702f, 2.16598f, 11.9044f, 2.1387f, 11.8372f, 2.11499f)
        curveTo(11.5141f, 2.00098f, 11.1614f, 2.00098f, 10.4558f, 2.00098f)
        curveTo(7.21082f, 2.00098f, 5.58831f, 2.00098f, 4.48933f, 2.88705f)
        curveTo(4.26731f, 3.06606f, 4.06508f, 3.26829f, 3.88607f, 3.49031f)
        curveTo(3f, 4.58928f, 3f, 6.2118f, 3f, 9.45682f)
        verticalLineTo(14.001f)
        curveTo(3f, 17.7722f, 3f, 19.6578f, 4.17157f, 20.8294f)
        curveTo(5.34315f, 22.001f, 7.22876f, 22.001f, 11f, 22.001f)
        horizontalLineTo(13.0345f)
        moveTo(12f, 2.50098f)
        verticalLineTo(3.00098f)
        curveTo(12f, 5.8294f, 12f, 7.24362f, 12.8787f, 8.1223f)
        curveTo(13.7574f, 9.00098f, 15.1716f, 9.00098f, 18f, 9.00098f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 15.001f)
        lineTo(17.7579f, 15.698f)
        curveTo(18.0961f, 16.612f, 18.2652f, 17.069f, 18.5986f, 17.4024f)
        curveTo(18.932f, 17.7357f, 19.389f, 17.9048f, 20.303f, 18.2431f)
        lineTo(21f, 18.501f)
        lineTo(20.303f, 18.7589f)
        curveTo(19.389f, 19.0971f, 18.932f, 19.2662f, 18.5986f, 19.5996f)
        curveTo(18.2652f, 19.933f, 18.0961f, 20.39f, 17.7579f, 21.3039f)
        lineTo(17.5f, 22.001f)
        lineTo(17.2421f, 21.3039f)
        curveTo(16.9039f, 20.39f, 16.7348f, 19.933f, 16.4014f, 19.5996f)
        curveTo(16.068f, 19.2662f, 15.611f, 19.0971f, 14.697f, 18.7589f)
        lineTo(14f, 18.501f)
        lineTo(14.697f, 18.2431f)
        curveTo(15.611f, 17.9048f, 16.068f, 17.7357f, 16.4014f, 17.4024f)
        curveTo(16.7348f, 17.069f, 16.9039f, 16.612f, 17.2421f, 15.698f)
        lineTo(17.5f, 15.001f)
        }
        }.build()

        return _aiFile!!
    }

private var _aiFile: ImageVector? = null
