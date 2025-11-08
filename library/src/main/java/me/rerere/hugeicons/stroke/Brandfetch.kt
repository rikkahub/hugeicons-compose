package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Brandfetch: ImageVector
    get() {
        if (_brandfetch != null) {
            return _brandfetch!!
        }
        _brandfetch = ImageVector.Builder(
            name = "Brandfetch",
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
        moveTo(5f, 6.85746f)
        curveTo(10.5f, 2.42557f, 19f, 3.53936f, 19f, 7.52832f)
        curveTo(19f, 10.5665f, 11.5f, 12f, 11.5f, 12f)
        curveTo(11.5f, 12f, 17.5f, 11.6935f, 17.5f, 14.451f)
        curveTo(17.5f, 19.0482f, 8f, 17.8628f, 8f, 17.8628f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8.5f)
        curveTo(8.33333f, 11.1667f, 7f, 16f, 7f, 20f)
        }
        }.build()

        return _brandfetch!!
    }

private var _brandfetch: ImageVector? = null
