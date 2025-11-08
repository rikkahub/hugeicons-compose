package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkCircle: ImageVector
    get() {
        if (_linkCircle != null) {
            return _linkCircle!!
        }
        _linkCircle = ImageVector.Builder(
            name = "LinkCircle",
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
        moveTo(21.0017f, 12.0004f)
        curveTo(21.0017f, 16.9712f, 16.9716f, 21.0007f, 12.0001f, 21.0007f)
        curveTo(7.02869f, 21.0007f, 2.99854f, 16.9712f, 2.99854f, 12.0004f)
        curveTo(2.99854f, 7.0296f, 7.02869f, 3f, 12.0001f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5537f, 3.46927f)
        lineTo(14.9902f, 9.0105f)
        moveTo(20.5537f, 3.46927f)
        curveTo(20.0585f, 2.97411f, 16.7223f, 3.02026f, 16.0171f, 3.03028f)
        moveTo(20.5537f, 3.46927f)
        curveTo(21.049f, 3.96442f, 21.0028f, 7.30005f, 20.9928f, 8.00523f)
        }
        }.build()

        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
