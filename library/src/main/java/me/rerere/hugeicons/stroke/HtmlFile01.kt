package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HtmlFile01: ImageVector
    get() {
        if (_htmlFile01 != null) {
            return _htmlFile01!!
        }
        _htmlFile01 = ImageVector.Builder(
            name = "HtmlFile01",
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
        moveTo(19.5f, 14f)
        verticalLineTo(10.6569f)
        curveTo(19.5f, 9.83935f, 19.5f, 9.4306f, 19.3478f, 9.06306f)
        curveTo(19.1955f, 8.69552f, 18.9065f, 8.40649f, 18.3284f, 7.82843f)
        lineTo(13.5919f, 3.09188f)
        curveTo(13.093f, 2.593f, 12.8436f, 2.34355f, 12.5345f, 2.19575f)
        curveTo(12.4702f, 2.165f, 12.4044f, 2.13772f, 12.3372f, 2.11401f)
        curveTo(12.0141f, 2f, 11.6614f, 2f, 10.9558f, 2f)
        curveTo(7.71082f, 2f, 6.08831f, 2f, 4.98933f, 2.88607f)
        curveTo(4.76731f, 3.06508f, 4.56508f, 3.26731f, 4.38607f, 3.48933f)
        curveTo(3.5f, 4.58831f, 3.5f, 6.21082f, 3.5f, 9.45584f)
        verticalLineTo(14f)
        moveTo(12.5f, 2.5f)
        verticalLineTo(3f)
        curveTo(12.5f, 5.82843f, 12.5f, 7.24264f, 13.3787f, 8.12132f)
        curveTo(14.2574f, 9f, 15.6716f, 9f, 18.5f, 9f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 17f)
        verticalLineTo(19.5f)
        moveTo(5.5f, 19.5f)
        verticalLineTo(22f)
        moveTo(5.5f, 19.5f)
        horizontalLineTo(2.5f)
        moveTo(2.5f, 17f)
        verticalLineTo(19.5f)
        moveTo(2.5f, 19.5f)
        verticalLineTo(22f)
        moveTo(9f, 17f)
        verticalLineTo(22f)
        moveTo(9f, 17f)
        horizontalLineTo(7.5f)
        moveTo(9f, 17f)
        horizontalLineTo(10.5f)
        moveTo(12.5f, 22f)
        verticalLineTo(17f)
        lineTo(14.5f, 19.5f)
        lineTo(16.5f, 17f)
        verticalLineTo(22f)
        moveTo(19f, 17f)
        verticalLineTo(22f)
        horizontalLineTo(21.5f)
        }
        }.build()

        return _htmlFile01!!
    }

private var _htmlFile01: ImageVector? = null
