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

val HugeIcons.AlignHorizontalDistributeCenter: ImageVector
    get() {
        if (_alignHorizontalDistributeCenter != null) {
            return _alignHorizontalDistributeCenter!!
        }
        _alignHorizontalDistributeCenter = ImageVector.Builder(
            name = "AlignHorizontalDistributeCenter",
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
            moveTo(16.5f, 8f)
            verticalLineTo(3f)
            moveTo(16.5f, 16.5f)
            verticalLineTo(21f)
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
            moveTo(7.5f, 6f)
            verticalLineTo(3f)
            moveTo(7.5f, 18.5f)
            verticalLineTo(21f)
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
            moveTo(7.5f, 6.00036f)
            curveTo(8.34389f, 6.00036f, 9.31789f, 5.91699f, 9.79904f, 6.75036f)
            curveTo(10f, 7.09844f, 10f, 7.56575f, 10f, 8.50036f)
            lineTo(10f, 15.5004f)
            curveTo(10f, 16.435f, 10f, 16.9023f, 9.79904f, 17.2504f)
            curveTo(9.31789f, 18.0837f, 8.34389f, 18.0004f, 7.5f, 18.0004f)
            curveTo(6.65611f, 18.0004f, 5.68211f, 18.0837f, 5.20096f, 17.2504f)
            curveTo(5f, 16.9023f, 5f, 16.435f, 5f, 15.5004f)
            lineTo(5f, 8.50036f)
            curveTo(5f, 7.56575f, 5f, 7.09844f, 5.20096f, 6.75036f)
            curveTo(5.68211f, 5.91699f, 6.65611f, 6.00036f, 7.5f, 6.00036f)
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
            moveTo(16.5f, 8.00036f)
            curveTo(17.3439f, 8.00036f, 18.3179f, 7.91699f, 18.799f, 8.75036f)
            curveTo(19f, 9.09844f, 19f, 9.56575f, 19f, 10.5004f)
            lineTo(19f, 13.5004f)
            curveTo(19f, 14.435f, 19f, 14.9023f, 18.799f, 15.2504f)
            curveTo(18.3179f, 16.0837f, 17.3439f, 16.0004f, 16.5f, 16.0004f)
            curveTo(15.6561f, 16.0004f, 14.6821f, 16.0837f, 14.201f, 15.2504f)
            curveTo(14f, 14.9023f, 14f, 14.435f, 14f, 13.5004f)
            lineTo(14f, 10.5004f)
            curveTo(14f, 9.56575f, 14f, 9.09844f, 14.201f, 8.75036f)
            curveTo(14.6821f, 7.91699f, 15.6561f, 8.00036f, 16.5f, 8.00036f)
            close()
        }
        }.build()

        return _alignHorizontalDistributeCenter!!
    }

private var _alignHorizontalDistributeCenter: ImageVector? = null
