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

val HugeIcons.MessageCircleMore: ImageVector
    get() {
        if (_messageCircleMore != null) {
            return _messageCircleMore!!
        }
        _messageCircleMore = ImageVector.Builder(
            name = "MessageCircleMore",
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
            moveTo(21.4961f, 12f)
            curveTo(21.4961f, 17.2467f, 17.2428f, 21.5f, 11.9961f, 21.5f)
            curveTo(10.368f, 21.5f, 8.83549f, 21.0904f, 7.49609f, 20.3687f)
            curveTo(5.62786f, 19.362f, 4.37071f, 20.2979f, 3.26202f, 20.4658f)
            curveTo(3.09383f, 20.4913f, 2.92634f, 20.4302f, 2.80606f, 20.31f)
            curveTo(2.6235f, 20.1274f, 2.58875f, 19.8451f, 2.6896f, 19.6074f)
            curveTo(3.12475f, 18.5818f, 3.5243f, 16.6382f, 2.9795f, 15f)
            curveTo(2.6659f, 14.057f, 2.49609f, 13.0483f, 2.49609f, 12f)
            curveTo(2.49609f, 6.75329f, 6.74939f, 2.5f, 11.9961f, 2.5f)
            curveTo(17.2428f, 2.5f, 21.4961f, 6.75329f, 21.4961f, 12f)
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
            moveTo(12.1218f, 12f)
            horizontalLineTo(11.9968f)
            moveTo(8.12109f, 12f)
            horizontalLineTo(7.99609f)
            moveTo(16.1211f, 12f)
            horizontalLineTo(15.9961f)
            moveTo(12.2468f, 12f)
            curveTo(12.2468f, 12.1381f, 12.1349f, 12.25f, 11.9968f, 12.25f)
            curveTo(11.8588f, 12.25f, 11.7468f, 12.1381f, 11.7468f, 12f)
            curveTo(11.7468f, 11.8619f, 11.8588f, 11.75f, 11.9968f, 11.75f)
            curveTo(12.1349f, 11.75f, 12.2468f, 11.8619f, 12.2468f, 12f)
            close()
            moveTo(8.24609f, 12f)
            curveTo(8.24609f, 12.1381f, 8.13416f, 12.25f, 7.99609f, 12.25f)
            curveTo(7.85802f, 12.25f, 7.74609f, 12.1381f, 7.74609f, 12f)
            curveTo(7.74609f, 11.8619f, 7.85802f, 11.75f, 7.99609f, 11.75f)
            curveTo(8.13416f, 11.75f, 8.24609f, 11.8619f, 8.24609f, 12f)
            close()
            moveTo(16.2461f, 12f)
            curveTo(16.2461f, 12.1381f, 16.1342f, 12.25f, 15.9961f, 12.25f)
            curveTo(15.858f, 12.25f, 15.7461f, 12.1381f, 15.7461f, 12f)
            curveTo(15.7461f, 11.8619f, 15.858f, 11.75f, 15.9961f, 11.75f)
            curveTo(16.1342f, 11.75f, 16.2461f, 11.8619f, 16.2461f, 12f)
            close()
        }
        }.build()

        return _messageCircleMore!!
    }

private var _messageCircleMore: ImageVector? = null
