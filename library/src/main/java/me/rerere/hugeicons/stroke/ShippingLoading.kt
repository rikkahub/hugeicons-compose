package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShippingLoading: ImageVector
    get() {
        if (_shippingLoading != null) {
            return _shippingLoading!!
        }
        _shippingLoading = ImageVector.Builder(
            name = "ShippingLoading",
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
        moveTo(4f, 9.87755f)
        verticalLineTo(6f)
        horizontalLineTo(18f)
        verticalLineTo(9.87755f)
        curveTo(18f, 12.7637f, 18f, 14.2068f, 17.0888f, 15.1034f)
        curveTo(16.1776f, 16f, 14.711f, 16f, 11.7778f, 16f)
        horizontalLineTo(10.2222f)
        curveTo(7.28904f, 16f, 5.82245f, 16f, 4.91122f, 15.1034f)
        curveTo(4f, 14.2068f, 4f, 12.7637f, 4f, 9.87755f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6f)
        lineTo(4.67308f, 4.46154f)
        curveTo(5.19508f, 3.26838f, 5.45609f, 2.6718f, 5.98513f, 2.3359f)
        curveTo(6.51417f, 2f, 7.19278f, 2f, 8.55f, 2f)
        horizontalLineTo(13.45f)
        curveTo(14.8072f, 2f, 15.4858f, 2f, 16.0149f, 2.3359f)
        curveTo(16.5439f, 2.6718f, 16.8049f, 3.26838f, 17.3269f, 4.46154f)
        lineTo(18f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 9f)
        horizontalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 16f)
        horizontalLineTo(18f)
        curveTo(19.6569f, 16f, 21f, 17.3431f, 21f, 19f)
        curveTo(21f, 20.6569f, 19.6569f, 22f, 18f, 22f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        horizontalLineTo(17.009f)
        moveTo(11f, 19f)
        horizontalLineTo(11.009f)
        moveTo(5f, 19f)
        horizontalLineTo(5.00898f)
        }
        }.build()

        return _shippingLoading!!
    }

private var _shippingLoading: ImageVector? = null
