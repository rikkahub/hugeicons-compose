package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mollie: ImageVector
    get() {
        if (_mollie != null) {
            return _mollie!!
        }
        _mollie = ImageVector.Builder(
            name = "Mollie",
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
        moveTo(6f, 18f)
        horizontalLineTo(2f)
        verticalLineTo(12f)
        curveTo(2f, 8.68629f, 4.68629f, 6f, 8f, 6f)
        curveTo(9.53671f, 6f, 10.9385f, 6.57771f, 12f, 7.52779f)
        curveTo(13.0615f, 6.57771f, 14.4633f, 6f, 16f, 6f)
        curveTo(19.3137f, 6f, 22f, 8.68629f, 22f, 12f)
        verticalLineTo(18f)
        horizontalLineTo(18f)
        verticalLineTo(12f)
        curveTo(18f, 10.8954f, 17.1046f, 10f, 16f, 10f)
        curveTo(14.8954f, 10f, 14f, 10.8954f, 14f, 12f)
        verticalLineTo(18f)
        horizontalLineTo(10f)
        verticalLineTo(12f)
        curveTo(10f, 10.8954f, 9.10457f, 10f, 8f, 10f)
        curveTo(6.89543f, 10f, 6f, 10.8954f, 6f, 12f)
        verticalLineTo(18f)
        }
        }.build()

        return _mollie!!
    }

private var _mollie: ImageVector? = null
