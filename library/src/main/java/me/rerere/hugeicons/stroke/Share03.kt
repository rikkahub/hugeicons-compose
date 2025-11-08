package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share03: ImageVector
    get() {
        if (_share03 != null) {
            return _share03!!
        }
        _share03 = ImageVector.Builder(
            name = "Share03",
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
        moveTo(8f, 7f)
        curveTo(8f, 7f, 10.1958f, 4.28386f, 11.4044f, 3.23889f)
        curveTo(11.5987f, 3.0709f, 11.8169f, 2.99152f, 12.0337f, 3.00072f)
        curveTo(12.2282f, 3.00897f, 12.4215f, 3.08844f, 12.5958f, 3.23912f)
        curveTo(13.8041f, 4.28428f, 16f, 7f, 16f, 7f)
        moveTo(12.0337f, 4f)
        lineTo(12.0337f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11f)
        curveTo(6.59987f, 11f, 5.8998f, 11f, 5.36502f, 11.2725f)
        curveTo(4.89462f, 11.5122f, 4.51217f, 11.8946f, 4.27248f, 12.365f)
        curveTo(4f, 12.8998f, 4f, 13.5999f, 4f, 15f)
        verticalLineTo(16f)
        curveTo(4f, 18.357f, 4f, 19.5355f, 4.73223f, 20.2678f)
        curveTo(5.46447f, 21f, 6.64298f, 21f, 9f, 21f)
        horizontalLineTo(15f)
        curveTo(17.357f, 21f, 18.5355f, 21f, 19.2678f, 20.2678f)
        curveTo(20f, 19.5355f, 20f, 18.357f, 20f, 16f)
        verticalLineTo(15f)
        curveTo(20f, 13.5999f, 20f, 12.8998f, 19.7275f, 12.365f)
        curveTo(19.4878f, 11.8946f, 19.1054f, 11.5122f, 18.635f, 11.2725f)
        curveTo(18.1002f, 11f, 17.4001f, 11f, 16f, 11f)
        }
        }.build()

        return _share03!!
    }

private var _share03: ImageVector? = null
