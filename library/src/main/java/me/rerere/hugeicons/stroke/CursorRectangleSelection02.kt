package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorRectangleSelection02: ImageVector
    get() {
        if (_cursorRectangleSelection02 != null) {
            return _cursorRectangleSelection02!!
        }
        _cursorRectangleSelection02 = ImageVector.Builder(
            name = "CursorRectangleSelection02",
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
        moveTo(14.5352f, 11.0865f)
        lineTo(18.5575f, 12.6605f)
        curveTo(20.8775f, 13.5683f, 22.0375f, 14.0222f, 21.9991f, 14.7422f)
        curveTo(21.9606f, 15.4622f, 20.75f, 15.7924f, 18.3288f, 16.4527f)
        curveTo(17.6079f, 16.6493f, 17.2475f, 16.7476f, 16.9976f, 16.9976f)
        curveTo(16.7476f, 17.2475f, 16.6493f, 17.6079f, 16.4527f, 18.3288f)
        curveTo(15.7924f, 20.75f, 15.4622f, 21.9606f, 14.7422f, 21.9991f)
        curveTo(14.0222f, 22.0375f, 13.5683f, 20.8775f, 12.6605f, 18.5575f)
        lineTo(11.0865f, 14.5352f)
        curveTo(10.136f, 12.1062f, 9.6608f, 10.8918f, 10.2763f, 10.2763f)
        curveTo(10.8918f, 9.6608f, 12.1062f, 10.136f, 14.5352f, 11.0865f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        verticalLineTo(11.5f)
        moveTo(11.5f, 2f)
        horizontalLineTo(8.5f)
        moveTo(8.5f, 18f)
        horizontalLineTo(9f)
        moveTo(18f, 9f)
        verticalLineTo(8.5f)
        moveTo(4.5f, 18f)
        curveTo(3.11929f, 18f, 2f, 16.8807f, 2f, 15.5f)
        moveTo(2f, 4.5f)
        curveTo(2f, 3.11929f, 3.11929f, 2f, 4.5f, 2f)
        moveTo(18f, 4.5f)
        curveTo(18f, 3.11929f, 16.8807f, 2f, 15.5f, 2f)
        }
        }.build()

        return _cursorRectangleSelection02!!
    }

private var _cursorRectangleSelection02: ImageVector? = null
