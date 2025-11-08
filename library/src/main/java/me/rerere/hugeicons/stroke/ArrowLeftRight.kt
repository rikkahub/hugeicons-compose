package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) {
            return _arrowLeftRight!!
        }
        _arrowLeftRight = ImageVector.Builder(
            name = "ArrowLeftRight",
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
        moveTo(19.9999f, 17f)
        lineTo(3.99994f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        curveTo(17f, 14f, 19.9999f, 16.2095f, 19.9999f, 17f)
        curveTo(19.9999f, 17.7906f, 16.9999f, 20f, 16.9999f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99994f, 7f)
        lineTo(19.9999f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99991f, 4f)
        curveTo(6.99991f, 4f, 3.99994f, 6.20947f, 3.99994f, 7.00002f)
        curveTo(3.99993f, 7.79058f, 6.99994f, 10f, 6.99994f, 10f)
        }
        }.build()

        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
