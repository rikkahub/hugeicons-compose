package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDataTransferVertical: ImageVector
    get() {
        if (_squareArrowDataTransferVertical != null) {
            return _squareArrowDataTransferVertical!!
        }
        _squareArrowDataTransferVertical = ImageVector.Builder(
            name = "SquareArrowDataTransferVertical",
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
        moveTo(8f, 14.0844f)
        lineTo(9.31716f, 15.9429f)
        curveTo(9.60777f, 16.3529f, 9.75307f, 16.5579f, 9.87654f, 16.4857f)
        curveTo(10f, 16.4136f, 10f, 16.1237f, 10f, 15.5438f)
        lineTo(10f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9.91559f)
        lineTo(14.6828f, 8.05715f)
        curveTo(14.3922f, 7.64711f, 14.2469f, 7.4421f, 14.1235f, 7.51425f)
        curveTo(14f, 7.58641f, 14f, 7.87635f, 14f, 8.45623f)
        lineTo(14f, 16.5f)
        }
        }.build()

        return _squareArrowDataTransferVertical!!
    }

private var _squareArrowDataTransferVertical: ImageVector? = null
