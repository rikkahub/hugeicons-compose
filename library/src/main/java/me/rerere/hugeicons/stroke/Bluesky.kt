package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bluesky: ImageVector
    get() {
        if (_bluesky != null) {
            return _bluesky!!
        }
        _bluesky = ImageVector.Builder(
            name = "Bluesky",
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
        moveTo(12f, 11.4963f)
        curveTo(11.8936f, 11.2963f, 7.45492f, 3f, 3.50417f, 3f)
        curveTo(1.33647f, 3f, 2.00456f, 8f, 2.50443f, 10.5f)
        curveTo(2.70653f, 11.5108f, 3.50417f, 14.5f, 8.003f, 14f)
        curveTo(8.003f, 14f, 4.00404f, 14.5f, 4.00404f, 17f)
        curveTo(4.00404f, 18.5f, 6.50339f, 21f, 8.50287f, 21f)
        curveTo(10.4606f, 21f, 11.9391f, 16.6859f, 12f, 16.5058f)
        curveTo(12.0609f, 16.6859f, 13.5394f, 21f, 15.4971f, 21f)
        curveTo(17.4966f, 21f, 19.996f, 18.5f, 19.996f, 17f)
        curveTo(19.996f, 14.5f, 15.997f, 14f, 15.997f, 14f)
        curveTo(20.4958f, 14.5f, 21.2935f, 11.5108f, 21.4956f, 10.5f)
        curveTo(21.9954f, 8f, 22.6635f, 3f, 20.4958f, 3f)
        curveTo(16.5451f, 3f, 12.1064f, 11.2963f, 12f, 11.4963f)
        }
        }.build()

        return _bluesky!!
    }

private var _bluesky: ImageVector? = null
