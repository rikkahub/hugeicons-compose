package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lollipop: ImageVector
    get() {
        if (_lollipop != null) {
            return _lollipop!!
        }
        _lollipop = ImageVector.Builder(
            name = "Lollipop",
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
        moveTo(12f, 14f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7.96552f)
        curveTo(7f, 6.49994f, 9f, 5.66926f, 10.2857f, 6.12258f)
        curveTo(11.7609f, 6.6427f, 12.0271f, 8.38074f, 13.5f, 8.90693f)
        curveTo(15f, 9.4428f, 15.5f, 7.46972f, 18f, 7.93534f)
        }
        }.build()

        return _lollipop!!
    }

private var _lollipop: ImageVector? = null
