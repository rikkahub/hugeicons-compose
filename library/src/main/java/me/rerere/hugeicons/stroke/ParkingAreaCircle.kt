package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ParkingAreaCircle: ImageVector
    get() {
        if (_parkingAreaCircle != null) {
            return _parkingAreaCircle!!
        }
        _parkingAreaCircle = ImageVector.Builder(
            name = "ParkingAreaCircle",
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
        moveTo(9f, 13f)
        verticalLineTo(8.4f)
        curveTo(9f, 8.02774f, 9f, 7.84162f, 9.04894f, 7.69098f)
        curveTo(9.14786f, 7.38655f, 9.38655f, 7.14786f, 9.69098f, 7.04894f)
        curveTo(9.84162f, 7f, 10.0277f, 7f, 10.4f, 7f)
        horizontalLineTo(13f)
        curveTo(14.6569f, 7f, 16f, 8.34315f, 16f, 10f)
        curveTo(16f, 11.6569f, 14.6569f, 13f, 13f, 13f)
        horizontalLineTo(9f)
        moveTo(9f, 13f)
        verticalLineTo(18f)
        }
        }.build()

        return _parkingAreaCircle!!
    }

private var _parkingAreaCircle: ImageVector? = null
