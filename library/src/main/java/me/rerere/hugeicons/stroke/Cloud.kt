package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = ImageVector.Builder(
            name = "Cloud",
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
        moveTo(17.4776f, 10.0001f)
        curveTo(17.485f, 10f, 17.4925f, 10f, 17.5f, 10f)
        curveTo(19.9853f, 10f, 22f, 12.0147f, 22f, 14.5f)
        curveTo(22f, 16.9853f, 19.9853f, 19f, 17.5f, 19f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 19f, 2f, 16.7614f, 2f, 14f)
        curveTo(2f, 11.4003f, 3.98398f, 9.26407f, 6.52042f, 9.0227f)
        moveTo(17.4776f, 10.0001f)
        curveTo(17.4924f, 9.83536f, 17.5f, 9.66856f, 17.5f, 9.5f)
        curveTo(17.5f, 6.46243f, 15.0376f, 4f, 12f, 4f)
        curveTo(9.12324f, 4f, 6.76233f, 6.20862f, 6.52042f, 9.0227f)
        moveTo(17.4776f, 10.0001f)
        curveTo(17.3753f, 11.1345f, 16.9286f, 12.1696f, 16.2428f, 13f)
        moveTo(6.52042f, 9.0227f)
        curveTo(6.67826f, 9.00768f, 6.83823f, 9f, 7f, 9f)
        curveTo(8.12582f, 9f, 9.16474f, 9.37209f, 10.0005f, 10f)
        }
        }.build()

        return _cloud!!
    }

private var _cloud: ImageVector? = null
