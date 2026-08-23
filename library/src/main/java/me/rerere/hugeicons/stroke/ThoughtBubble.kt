package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = ImageVector.Builder(
            name = "ThoughtBubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.2097f, 4.50414f)
            curveTo(17.6175f, 3.03612f, 16.1802f, 2f, 14.5f, 2f)
            curveTo(13.5449f, 2f, 12.6677f, 2.33456f, 11.9797f, 2.89307f)
            curveTo(11.6071f, 3.19559f, 11.0924f, 3.29787f, 10.632f, 3.16233f)
            curveTo(10.2731f, 3.05667f, 9.89315f, 3f, 9.5f, 3f)
            curveTo(7.29086f, 3f, 5.5f, 4.79086f, 5.5f, 7f)
            curveTo(5.5f, 7.07309f, 5.45242f, 7.13761f, 5.38224f, 7.158f)
            curveTo(3.71705f, 7.64164f, 2.5f, 9.1788f, 2.5f, 11f)
            curveTo(2.5f, 12.8675f, 3.77976f, 14.4361f, 5.51012f, 14.8766f)
            curveTo(6.04533f, 15.0128f, 6.48717f, 15.4547f, 6.62343f, 15.9899f)
            curveTo(7.06394f, 17.7202f, 8.63252f, 19f, 10.5f, 19f)
            curveTo(11.5343f, 19f, 12.4762f, 18.6071f, 13.1858f, 17.9626f)
            curveTo(13.6408f, 17.5494f, 14.3546f, 17.4315f, 14.919f, 17.6749f)
            curveTo(15.4039f, 17.884f, 15.9383f, 18f, 16.5f, 18f)
            curveTo(18.7091f, 18f, 20.5f, 16.2091f, 20.5f, 14f)
            curveTo(20.5f, 13.6065f, 20.4431f, 13.2263f, 20.3372f, 12.8671f)
            curveTo(20.2014f, 12.4067f, 20.3036f, 11.8918f, 20.6063f, 11.5192f)
            curveTo(21.165f, 10.8316f, 21.5f, 9.95507f, 21.5f, 9f)
            curveTo(21.5f, 7.31942f, 20.4635f, 5.88127f, 18.9949f, 5.2892f)
            curveTo(18.6394f, 5.14587f, 18.3531f, 4.85962f, 18.2097f, 4.50414f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.5f, 20.5f)
            curveTo(5.5f, 21.3284f, 4.82843f, 22f, 4f, 22f)
            curveTo(3.17157f, 22f, 2.5f, 21.3284f, 2.5f, 20.5f)
            curveTo(2.5f, 19.6716f, 3.17157f, 19f, 4f, 19f)
            curveTo(4.82843f, 19f, 5.5f, 19.6716f, 5.5f, 20.5f)
            close()
        }
        }.build()

        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
