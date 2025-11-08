package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkflowCircle01: ImageVector
    get() {
        if (_workflowCircle01 != null) {
            return _workflowCircle01!!
        }
        _workflowCircle01 = ImageVector.Builder(
            name = "WorkflowCircle01",
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
        moveTo(9f, 9f)
        curveTo(9f, 10.6569f, 7.65685f, 12f, 6f, 12f)
        curveTo(4.34315f, 12f, 3f, 10.6569f, 3f, 9f)
        curveTo(3f, 7.34315f, 4.34315f, 6f, 6f, 6f)
        curveTo(7.65685f, 6f, 9f, 7.34315f, 9f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18f)
        curveTo(21f, 19.6569f, 19.6569f, 21f, 18f, 21f)
        curveTo(16.3431f, 21f, 15f, 19.6569f, 15f, 18f)
        curveTo(15f, 16.3431f, 16.3431f, 15f, 18f, 15f)
        curveTo(19.6569f, 15f, 21f, 16.3431f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        horizontalLineTo(14f)
        curveTo(15.8856f, 9f, 16.8284f, 9f, 17.4142f, 9.58579f)
        curveTo(18f, 10.1716f, 18f, 11.1144f, 18f, 13f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        verticalLineTo(22f)
        moveTo(6f, 6f)
        verticalLineTo(2f)
        }
        }.build()

        return _workflowCircle01!!
    }

private var _workflowCircle01: ImageVector? = null
