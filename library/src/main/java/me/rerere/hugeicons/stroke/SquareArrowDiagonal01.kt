package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDiagonal01: ImageVector
    get() {
        if (_squareArrowDiagonal01 != null) {
            return _squareArrowDiagonal01!!
        }
        _squareArrowDiagonal01 = ImageVector.Builder(
            name = "SquareArrowDiagonal01",
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
        moveTo(8.19915f, 15.8008f)
        lineTo(15.8008f, 8.19915f)
        moveTo(8.19915f, 15.8008f)
        curveTo(7.75558f, 15.3573f, 8.19018f, 13.2652f, 8.19915f, 12.6335f)
        moveTo(8.19915f, 15.8008f)
        curveTo(8.64273f, 16.2444f, 10.7348f, 15.8098f, 11.3665f, 15.8008f)
        moveTo(15.8008f, 8.19915f)
        curveTo(15.3573f, 7.75558f, 13.2652f, 8.19018f, 12.6335f, 8.19916f)
        moveTo(15.8008f, 8.19915f)
        curveTo(16.2444f, 8.64273f, 15.8098f, 10.7348f, 15.8008f, 11.3665f)
        }

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
        }.build()

        return _squareArrowDiagonal01!!
    }

private var _squareArrowDiagonal01: ImageVector? = null
