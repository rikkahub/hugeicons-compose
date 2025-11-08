package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = ImageVector.Builder(
            name = "AlignRight",
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
        moveTo(10.0004f, 7.5f)
        curveTo(10.0004f, 6.65611f, 9.91699f, 5.68211f, 10.7504f, 5.20096f)
        curveTo(11.0984f, 5f, 11.5657f, 5f, 12.5004f, 5f)
        horizontalLineTo(13.5004f)
        curveTo(14.435f, 5f, 14.9023f, 5f, 15.2504f, 5.20096f)
        curveTo(16.0837f, 5.68211f, 16.0004f, 6.65611f, 16.0004f, 7.5f)
        curveTo(16.0004f, 8.34389f, 16.0837f, 9.31789f, 15.2504f, 9.79904f)
        curveTo(14.9023f, 10f, 14.435f, 10f, 13.5004f, 10f)
        horizontalLineTo(12.5004f)
        curveTo(11.5657f, 10f, 11.0984f, 10f, 10.7504f, 9.79904f)
        curveTo(9.91699f, 9.31789f, 10.0004f, 8.34389f, 10.0004f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.00036f, 16.5f)
        curveTo(4.00036f, 15.6561f, 3.91699f, 14.6821f, 4.75036f, 14.201f)
        curveTo(5.09844f, 14f, 5.56575f, 14f, 6.50036f, 14f)
        horizontalLineTo(13.5004f)
        curveTo(14.435f, 14f, 14.9023f, 14f, 15.2504f, 14.201f)
        curveTo(16.0837f, 14.6821f, 16.0004f, 15.6561f, 16.0004f, 16.5f)
        curveTo(16.0004f, 17.3439f, 16.0837f, 18.3179f, 15.2504f, 18.799f)
        curveTo(14.9023f, 19f, 14.435f, 19f, 13.5004f, 19f)
        horizontalLineTo(6.50036f)
        curveTo(5.56575f, 19f, 5.09844f, 19f, 4.75036f, 18.799f)
        curveTo(3.91699f, 18.3179f, 4.00036f, 17.3439f, 4.00036f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 2f)
        verticalLineTo(22f)
        }
        }.build()

        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
