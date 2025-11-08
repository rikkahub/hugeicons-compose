package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDataTransferDiagonal: ImageVector
    get() {
        if (_circleArrowDataTransferDiagonal != null) {
            return _circleArrowDataTransferDiagonal!!
        }
        _circleArrowDataTransferDiagonal = ImageVector.Builder(
            name = "CircleArrowDataTransferDiagonal",
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
        moveTo(13.6898f, 8f)
        lineTo(8.87715f, 13.1068f)
        curveTo(8.48493f, 13.523f, 8.28882f, 13.7311f, 8.13302f, 13.6693f)
        curveTo(7.97723f, 13.6076f, 7.98998f, 13.3268f, 8.01548f, 12.7653f)
        lineTo(8.09598f, 10.9932f)
        moveTo(10.3102f, 16f)
        lineTo(15.1228f, 10.8932f)
        curveTo(15.5151f, 10.477f, 15.7112f, 10.2689f, 15.867f, 10.3307f)
        curveTo(16.0228f, 10.3924f, 16.01f, 10.6732f, 15.9845f, 11.2347f)
        lineTo(15.904f, 13.0068f)
        }
        }.build()

        return _circleArrowDataTransferDiagonal!!
    }

private var _circleArrowDataTransferDiagonal: ImageVector? = null
