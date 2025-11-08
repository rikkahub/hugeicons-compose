package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowDataTransferHorizontal: ImageVector
    get() {
        if (_squareArrowDataTransferHorizontal != null) {
            return _squareArrowDataTransferHorizontal!!
        }
        _squareArrowDataTransferHorizontal = ImageVector.Builder(
            name = "SquareArrowDataTransferHorizontal",
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
        moveTo(9.91559f, 8f)
        lineTo(8.05715f, 9.31716f)
        curveTo(7.64711f, 9.60777f, 7.4421f, 9.75307f, 7.51425f, 9.87654f)
        curveTo(7.58641f, 10f, 7.87635f, 10f, 8.45623f, 10f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0844f, 16f)
        lineTo(15.9428f, 14.6828f)
        curveTo(16.3529f, 14.3922f, 16.5579f, 14.2469f, 16.4857f, 14.1235f)
        curveTo(16.4136f, 14f, 16.1237f, 14f, 15.5438f, 14f)
        horizontalLineTo(7.5f)
        }
        }.build()

        return _squareArrowDataTransferHorizontal!!
    }

private var _squareArrowDataTransferHorizontal: ImageVector? = null
