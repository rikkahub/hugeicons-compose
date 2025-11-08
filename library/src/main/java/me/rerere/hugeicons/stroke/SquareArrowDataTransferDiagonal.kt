package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDataTransferDiagonal: ImageVector
    get() {
        if (_squareArrowDataTransferDiagonal != null) {
            return _squareArrowDataTransferDiagonal!!
        }
        _squareArrowDataTransferDiagonal = ImageVector.Builder(
            name = "SquareArrowDataTransferDiagonal",
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
        moveTo(15.5766f, 13.8983f)
        lineTo(15.9282f, 11.7497f)
        curveTo(16.0058f, 11.2757f, 16.0446f, 11.0386f, 15.9175f, 11.0039f)
        curveTo(15.7905f, 10.9692f, 15.6021f, 11.1654f, 15.2254f, 11.5577f)
        lineTo(10f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.42338f, 10.1017f)
        lineTo(8.07175f, 12.2503f)
        curveTo(7.99417f, 12.7243f, 7.95538f, 12.9614f, 8.08246f, 12.9961f)
        curveTo(8.20954f, 13.0308f, 8.39789f, 12.8346f, 8.77459f, 12.4423f)
        lineTo(14f, 7f)
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

        return _squareArrowDataTransferDiagonal!!
    }

private var _squareArrowDataTransferDiagonal: ImageVector? = null
