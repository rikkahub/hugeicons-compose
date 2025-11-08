package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = ImageVector.Builder(
            name = "Apple",
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
        moveTo(12f, 5.75f)
        curveTo(12f, 3.75f, 13.5f, 1.75f, 15.5f, 1.75f)
        curveTo(15.5f, 3.75f, 14f, 5.75f, 12f, 5.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 8.09001f)
        curveTo(11.9851f, 8.09001f, 11.5867f, 7.92646f, 11.1414f, 7.74368f)
        curveTo(10.5776f, 7.51225f, 9.93875f, 7.25f, 8.89334f, 7.25f)
        curveTo(7.02235f, 7.25f, 4f, 8.74945f, 4f, 12.7495f)
        curveTo(4f, 17.4016f, 7.10471f, 22.25f, 9.10471f, 22.25f)
        curveTo(9.77426f, 22.25f, 10.3775f, 21.9871f, 10.954f, 21.7359f)
        curveTo(11.4815f, 21.5059f, 11.9868f, 21.2857f, 12.5f, 21.2857f)
        curveTo(13.0132f, 21.2857f, 13.5185f, 21.5059f, 14.046f, 21.7359f)
        curveTo(14.6225f, 21.9871f, 15.2257f, 22.25f, 15.8953f, 22.25f)
        curveTo(17.2879f, 22.25f, 18.9573f, 19.8992f, 20f, 16.9008f)
        curveTo(18.3793f, 16.2202f, 17.338f, 14.618f, 17.338f, 12.75f)
        curveTo(17.338f, 11.121f, 18.2036f, 10.0398f, 19.5f, 9.25f)
        curveTo(18.5f, 7.75f, 17.0134f, 7.25f, 15.9447f, 7.25f)
        curveTo(14.8993f, 7.25f, 14.2604f, 7.51225f, 13.6966f, 7.74368f)
        curveTo(13.2514f, 7.92646f, 13.0149f, 8.09001f, 12.5f, 8.09001f)
        }
        }.build()

        return _apple!!
    }

private var _apple: ImageVector? = null
