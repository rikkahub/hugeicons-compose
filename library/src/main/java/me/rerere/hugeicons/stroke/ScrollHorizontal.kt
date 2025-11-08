package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScrollHorizontal: ImageVector
    get() {
        if (_scrollHorizontal != null) {
            return _scrollHorizontal!!
        }
        _scrollHorizontal = ImageVector.Builder(
            name = "ScrollHorizontal",
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
        moveTo(14f, 12f)
        curveTo(14f, 13.1046f, 13.1046f, 14f, 12f, 14f)
        curveTo(10.8954f, 14f, 10f, 13.1046f, 10f, 12f)
        curveTo(10f, 10.8954f, 10.8954f, 10f, 12f, 10f)
        curveTo(13.1046f, 10f, 14f, 10.8954f, 14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.00023f, 12.0672f)
        curveTo(1.95947f, 10.6863f, 7.34458f, 7.43916f, 7.8518f, 8.08367f)
        curveTo(8.42696f, 8.81452f, 7.05181f, 10.9863f, 6.74208f, 11.6779f)
        curveTo(6.55582f, 12.0938f, 6.56093f, 12.2741f, 6.77271f, 12.6896f)
        curveTo(7.73186f, 14.571f, 8.20766f, 15.5084f, 7.91196f, 15.9136f)
        curveTo(7.44063f, 16.5595f, 2.04001f, 13.4149f, 2.00023f, 12.0672f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9989f, 12.0672f)
        curveTo(22.0396f, 10.6863f, 16.6545f, 7.43916f, 16.1473f, 8.08367f)
        curveTo(15.5721f, 8.81452f, 16.9473f, 10.9863f, 17.257f, 11.6779f)
        curveTo(17.4433f, 12.0938f, 17.4382f, 12.2741f, 17.2264f, 12.6896f)
        curveTo(16.2672f, 14.571f, 15.7915f, 15.5084f, 16.0871f, 15.9136f)
        curveTo(16.5585f, 16.5595f, 21.9591f, 13.4149f, 21.9989f, 12.0672f)
        }
        }.build()

        return _scrollHorizontal!!
    }

private var _scrollHorizontal: ImageVector? = null
