package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDiagonal02: ImageVector
    get() {
        if (_squareArrowDiagonal02 != null) {
            return _squareArrowDiagonal02!!
        }
        _squareArrowDiagonal02 = ImageVector.Builder(
            name = "SquareArrowDiagonal02",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8008f, 15.8008f)
        lineTo(8.19915f, 8.19915f)
        moveTo(15.8008f, 15.8008f)
        curveTo(16.2444f, 15.3573f, 15.8098f, 13.2652f, 15.8008f, 12.6335f)
        moveTo(15.8008f, 15.8008f)
        curveTo(15.3573f, 16.2444f, 13.2652f, 15.8098f, 12.6335f, 15.8008f)
        moveTo(8.19915f, 8.19915f)
        curveTo(8.64273f, 7.75558f, 10.7348f, 8.19018f, 11.3665f, 8.19916f)
        moveTo(8.19915f, 8.19915f)
        curveTo(7.75558f, 8.64273f, 8.19018f, 10.7348f, 8.19915f, 11.3665f)
        }
        }.build()

        return _squareArrowDiagonal02!!
    }

private var _squareArrowDiagonal02: ImageVector? = null
