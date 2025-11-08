package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowMoveDownLeft: ImageVector
    get() {
        if (_arrowMoveDownLeft != null) {
            return _arrowMoveDownLeft!!
        }
        _arrowMoveDownLeft = ImageVector.Builder(
            name = "ArrowMoveDownLeft",
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
        moveTo(20f, 3f)
        verticalLineTo(5.07692f)
        curveTo(20f, 7.07786f, 20f, 8.07833f, 19.8547f, 8.91545f)
        curveTo(19.0547f, 13.5235f, 15.0934f, 17.1376f, 10.0426f, 17.8674f)
        curveTo(9.12509f, 18f, 7.19318f, 18f, 5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 21f)
        curveTo(6.39316f, 20.4102f, 4f, 18.8403f, 4f, 18f)
        curveTo(4f, 17.1597f, 6.39316f, 15.5898f, 7f, 15f)
        }
        }.build()

        return _arrowMoveDownLeft!!
    }

private var _arrowMoveDownLeft: ImageVector? = null
