package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = ImageVector.Builder(
            name = "AlignLeft",
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
        moveTo(8.00232f, 7.5f)
        curveTo(8.00232f, 6.65611f, 7.91895f, 5.68211f, 8.75232f, 5.20096f)
        curveTo(9.10039f, 5f, 9.5677f, 5f, 10.5023f, 5f)
        horizontalLineTo(11.5023f)
        curveTo(12.4369f, 5f, 12.9042f, 5f, 13.2523f, 5.20096f)
        curveTo(14.0857f, 5.68211f, 14.0023f, 6.65611f, 14.0023f, 7.5f)
        curveTo(14.0023f, 8.34389f, 14.0857f, 9.31789f, 13.2523f, 9.79904f)
        curveTo(12.9042f, 10f, 12.4369f, 10f, 11.5023f, 10f)
        horizontalLineTo(10.5023f)
        curveTo(9.5677f, 10f, 9.10039f, 10f, 8.75232f, 9.79904f)
        curveTo(7.91895f, 9.31789f, 8.00232f, 8.34389f, 8.00232f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00232f, 16.5f)
        curveTo(8.00232f, 15.6561f, 7.91895f, 14.6821f, 8.75232f, 14.201f)
        curveTo(9.10039f, 14f, 9.5677f, 14f, 10.5023f, 14f)
        horizontalLineTo(17.5023f)
        curveTo(18.4369f, 14f, 18.9042f, 14f, 19.2523f, 14.201f)
        curveTo(20.0857f, 14.6821f, 20.0023f, 15.6561f, 20.0023f, 16.5f)
        curveTo(20.0023f, 17.3439f, 20.0857f, 18.3179f, 19.2523f, 18.799f)
        curveTo(18.9042f, 19f, 18.4369f, 19f, 17.5023f, 19f)
        horizontalLineTo(10.5023f)
        curveTo(9.5677f, 19f, 9.10039f, 19f, 8.75232f, 18.799f)
        curveTo(7.91895f, 18.3179f, 8.00232f, 17.3439f, 8.00232f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 2f)
        verticalLineTo(22f)
        }
        }.build()

        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
