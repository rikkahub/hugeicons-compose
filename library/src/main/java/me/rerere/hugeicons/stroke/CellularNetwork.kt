package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CellularNetwork: ImageVector
    get() {
        if (_cellularNetwork != null) {
            return _cellularNetwork!!
        }
        _cellularNetwork = ImageVector.Builder(
            name = "CellularNetwork",
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
        moveTo(12f, 11f)
        lineTo(12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        curveTo(14f, 10.1046f, 13.1046f, 11f, 12f, 11f)
        curveTo(10.8954f, 11f, 10f, 10.1046f, 10f, 9f)
        curveTo(10f, 7.89543f, 10.8954f, 7f, 12f, 7f)
        curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9588f, 6f)
        curveTo(17.6186f, 6.86961f, 18f, 7.89801f, 18f, 9f)
        curveTo(18f, 10.102f, 17.6186f, 11.1304f, 16.9588f, 12f)
        moveTo(7.04117f, 6f)
        curveTo(6.38143f, 6.86961f, 6f, 7.89801f, 6f, 9f)
        curveTo(6f, 10.102f, 6.38143f, 11.1304f, 7.04117f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.3159f, 4f)
        curveTo(21.3796f, 5.43008f, 22f, 7.14984f, 22f, 9f)
        curveTo(22f, 10.8502f, 21.3796f, 12.5699f, 20.3159f, 14f)
        moveTo(3.68409f, 4f)
        curveTo(2.62036f, 5.43008f, 2f, 7.14984f, 2f, 9f)
        curveTo(2f, 10.8502f, 2.62036f, 12.5699f, 3.68409f, 14f)
        }
        }.build()

        return _cellularNetwork!!
    }

private var _cellularNetwork: ImageVector? = null
