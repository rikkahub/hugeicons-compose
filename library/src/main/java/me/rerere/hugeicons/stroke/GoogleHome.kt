package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoogleHome: ImageVector
    get() {
        if (_googleHome != null) {
            return _googleHome!!
        }
        _googleHome = ImageVector.Builder(
            name = "GoogleHome",
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
        moveTo(22f, 11.2703f)
        curveTo(22f, 16.6439f, 17.5228f, 21f, 12f, 21f)
        curveTo(6.47715f, 21f, 2f, 16.6439f, 2f, 11.2703f)
        curveTo(2f, 8.76656f, 2.97195f, 6.48373f, 4.56875f, 4.75948f)
        curveTo(5.01425f, 4.27842f, 5.237f, 4.03789f, 5.88434f, 3.71276f)
        curveTo(6.53168f, 3.38764f, 6.98784f, 3.33859f, 7.90016f, 3.24048f)
        curveTo(9.0225f, 3.11979f, 10.5114f, 3f, 12f, 3f)
        curveTo(13.4886f, 3f, 14.9775f, 3.11979f, 16.0998f, 3.24048f)
        curveTo(17.0122f, 3.33859f, 17.4683f, 3.38764f, 18.1157f, 3.71276f)
        curveTo(18.763f, 4.03789f, 18.9857f, 4.27842f, 19.4313f, 4.75948f)
        curveTo(21.0281f, 6.48373f, 22f, 8.76656f, 22f, 11.2703f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4f)
        curveTo(18f, 5.10457f, 15.3137f, 6f, 12f, 6f)
        curveTo(8.68629f, 6f, 6f, 5.10457f, 6f, 4f)
        }
        }.build()

        return _googleHome!!
    }

private var _googleHome: ImageVector? = null
