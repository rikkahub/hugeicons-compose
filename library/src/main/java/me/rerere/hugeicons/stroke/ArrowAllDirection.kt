package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowAllDirection: ImageVector
    get() {
        if (_arrowAllDirection != null) {
            return _arrowAllDirection!!
        }
        _arrowAllDirection = ImageVector.Builder(
            name = "ArrowAllDirection",
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
        moveTo(11.9902f, 8.98595f)
        verticalLineTo(3.31543f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9902f, 20.6705f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.6702f, 12.0001f)
        lineTo(14.9999f, 11.9482f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00031f, 12.0001f)
        lineTo(3.33002f, 11.9482f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9999f, 5.99998f)
        curveTo(14.9999f, 5.99998f, 12.7904f, 3.00001f, 11.9999f, 3f)
        curveTo(11.2093f, 2.99999f, 8.99995f, 6f, 8.99995f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.99993f, 15f)
        curveTo(5.99993f, 15f, 2.99996f, 12.7905f, 2.99995f, 12f)
        curveTo(2.99994f, 11.2094f, 5.99995f, 9f, 5.99995f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9999f, 9f)
        curveTo(17.9999f, 9f, 20.9999f, 11.2095f, 20.9999f, 12f)
        curveTo(20.9999f, 12.7906f, 17.9999f, 15f, 17.9999f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99995f, 18f)
        curveTo(8.99995f, 18f, 11.2094f, 21f, 11.9999f, 21f)
        curveTo(12.7905f, 21f, 14.9999f, 18f, 14.9999f, 18f)
        }
        }.build()

        return _arrowAllDirection!!
    }

private var _arrowAllDirection: ImageVector? = null
