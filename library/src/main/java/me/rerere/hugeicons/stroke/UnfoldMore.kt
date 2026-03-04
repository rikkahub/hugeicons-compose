package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UnfoldMore: ImageVector
    get() {
        if (_unfoldMore != null) {
            return _unfoldMore!!
        }
        _unfoldMore = ImageVector.Builder(
            name = "UnfoldMore",
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
        moveTo(10.3483f, 10f)
        horizontalLineTo(13.6517f)
        curveTo(15.6822f, 10f, 16.6974f, 10f, 16.9501f, 9.39139f)
        curveTo(17.2028f, 8.78277f, 16.4849f, 8.06648f, 15.0491f, 6.63391f)
        lineTo(13.3974f, 4.9859f)
        lineTo(13.3974f, 4.9859f)
        curveTo(12.7387f, 4.32863f, 12.4093f, 4f, 12f, 4f)
        curveTo(11.5907f, 4f, 11.2613f, 4.32864f, 10.6026f, 4.9859f)
        lineTo(8.95091f, 6.63391f)
        lineTo(8.95091f, 6.63391f)
        curveTo(7.51513f, 8.06649f, 6.79724f, 8.78277f, 7.0499f, 9.39139f)
        curveTo(7.30256f, 10f, 8.31781f, 10f, 10.3483f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3483f, 14f)
        horizontalLineTo(13.6517f)
        curveTo(15.6822f, 14f, 16.6974f, 14f, 16.9501f, 14.6086f)
        curveTo(17.2028f, 15.2172f, 16.4849f, 15.9335f, 15.0491f, 17.3661f)
        lineTo(13.3974f, 19.0141f)
        curveTo(12.7387f, 19.6714f, 12.4093f, 20f, 12f, 20f)
        curveTo(11.5907f, 20f, 11.2613f, 19.6714f, 10.6026f, 19.0141f)
        lineTo(8.95091f, 17.3661f)
        curveTo(7.51513f, 15.9335f, 6.79724f, 15.2172f, 7.0499f, 14.6086f)
        curveTo(7.30256f, 14f, 8.31781f, 14f, 10.3483f, 14f)
        }
        }.build()

        return _unfoldMore!!
    }

private var _unfoldMore: ImageVector? = null
