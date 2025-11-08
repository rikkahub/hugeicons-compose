package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScrollVertical: ImageVector
    get() {
        if (_scrollVertical != null) {
            return _scrollVertical!!
        }
        _scrollVertical = ImageVector.Builder(
            name = "ScrollVertical",
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
        moveTo(11.9328f, 2.00023f)
        curveTo(13.3137f, 1.95947f, 16.5608f, 7.34458f, 15.9163f, 7.8518f)
        curveTo(15.1855f, 8.42696f, 13.0137f, 7.05181f, 12.3221f, 6.74208f)
        curveTo(11.9062f, 6.55582f, 11.7259f, 6.56093f, 11.3104f, 6.77271f)
        curveTo(9.42898f, 7.73186f, 8.49159f, 8.20766f, 8.08638f, 7.91196f)
        curveTo(7.44046f, 7.44063f, 10.5851f, 2.04001f, 11.9328f, 2.00023f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0672f, 21.9998f)
        curveTo(10.6863f, 22.0403f, 7.43916f, 16.6805f, 8.08367f, 16.1756f)
        curveTo(8.81453f, 15.6032f, 10.9863f, 16.9719f, 11.6779f, 17.2801f)
        curveTo(12.0938f, 17.4655f, 12.2741f, 17.4604f, 12.6896f, 17.2497f)
        curveTo(13.2694f, 16.9554f, 15.1991f, 15.6005f, 15.9136f, 16.1157f)
        curveTo(16.5595f, 16.5849f, 13.4149f, 21.9602f, 12.0672f, 21.9998f)
        }
        }.build()

        return _scrollVertical!!
    }

private var _scrollVertical: ImageVector? = null
