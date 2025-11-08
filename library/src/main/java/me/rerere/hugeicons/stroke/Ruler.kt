package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = ImageVector.Builder(
            name = "Ruler",
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
        moveTo(17.5f, 10.5f)
        lineTo(19.5f, 12.5f)
        moveTo(14f, 14f)
        lineTo(16f, 16f)
        moveTo(10.5f, 17.5f)
        lineTo(12.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5355f, 4.67767f)
        curveTo(11.9002f, 3.31296f, 12.5826f, 2.6306f, 13.3438f, 2.3153f)
        curveTo(14.3587f, 1.8949f, 15.4991f, 1.8949f, 16.5141f, 2.3153f)
        curveTo(17.2753f, 2.6306f, 17.9576f, 3.31296f, 19.3223f, 4.67767f)
        curveTo(20.687f, 6.04238f, 21.3694f, 6.72474f, 21.6847f, 7.48594f)
        curveTo(22.1051f, 8.50088f, 22.1051f, 9.64126f, 21.6847f, 10.6562f)
        curveTo(21.3694f, 11.4174f, 20.687f, 12.0998f, 19.3223f, 13.4645f)
        lineTo(13.4645f, 19.3223f)
        curveTo(12.0998f, 20.687f, 11.4174f, 21.3694f, 10.6562f, 21.6847f)
        curveTo(9.64126f, 22.1051f, 8.50088f, 22.1051f, 7.48594f, 21.6847f)
        curveTo(6.72474f, 21.3694f, 6.04238f, 20.687f, 4.67767f, 19.3223f)
        curveTo(3.31296f, 17.9576f, 2.6306f, 17.2753f, 2.3153f, 16.5141f)
        curveTo(1.8949f, 15.4991f, 1.8949f, 14.3587f, 2.3153f, 13.3438f)
        curveTo(2.6306f, 12.5826f, 3.31296f, 11.9002f, 4.67767f, 10.5355f)
        lineTo(10.5355f, 4.67767f)
        }
        }.build()

        return _ruler!!
    }

private var _ruler: ImageVector? = null
