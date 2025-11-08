package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StraightEdge: ImageVector
    get() {
        if (_straightEdge != null) {
            return _straightEdge!!
        }
        _straightEdge = ImageVector.Builder(
            name = "StraightEdge",
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
        moveTo(6.5f, 17.5008f)
        lineTo(10.501f, 13.5f)
        moveTo(13.501f, 10.5f)
        lineTo(17.501f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 12f)
        curveTo(14f, 13.1046f, 13.1046f, 14f, 12f, 14f)
        curveTo(10.8954f, 14f, 10f, 13.1046f, 10f, 12f)
        curveTo(10f, 10.8954f, 10.8954f, 10f, 12f, 10f)
        curveTo(13.1046f, 10f, 14f, 10.8954f, 14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 5f)
        curveTo(21f, 6.10457f, 20.1046f, 7f, 19f, 7f)
        curveTo(17.8954f, 7f, 17f, 6.10457f, 17f, 5f)
        curveTo(17f, 3.89543f, 17.8954f, 3f, 19f, 3f)
        curveTo(20.1046f, 3f, 21f, 3.89543f, 21f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 19f)
        curveTo(7f, 20.1046f, 6.10457f, 21f, 5f, 21f)
        curveTo(3.89543f, 21f, 3f, 20.1046f, 3f, 19f)
        curveTo(3f, 17.8954f, 3.89543f, 17f, 5f, 17f)
        curveTo(6.10457f, 17f, 7f, 17.8954f, 7f, 19f)
        }
        }.build()

        return _straightEdge!!
    }

private var _straightEdge: ImageVector? = null
