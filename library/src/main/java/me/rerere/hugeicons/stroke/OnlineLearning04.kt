package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OnlineLearning04: ImageVector
    get() {
        if (_onlineLearning04 != null) {
            return _onlineLearning04!!
        }
        _onlineLearning04 = ImageVector.Builder(
            name = "OnlineLearning04",
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
        moveTo(8.5f, 19f)
        horizontalLineTo(8.51f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        curveTo(4.90328f, 6.05476f, 4.2191f, 6.21819f, 3.73223f, 6.7059f)
        curveTo(3f, 7.43939f, 3f, 8.61994f, 3f, 10.981f)
        verticalLineTo(16.9914f)
        curveTo(3f, 19.3525f, 3f, 20.533f, 3.73223f, 21.2665f)
        curveTo(4.46447f, 22f, 5.64298f, 22f, 8f, 22f)
        horizontalLineTo(9f)
        curveTo(11.357f, 22f, 12.5355f, 22f, 13.2678f, 21.2665f)
        curveTo(14f, 20.533f, 14f, 19.3525f, 14f, 16.9914f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4f)
        verticalLineTo(11.5f)
        moveTo(9.77631f, 2.08242f)
        curveTo(13.178f, 1.58922f, 15f, 3.47059f, 15f, 3.47059f)
        curveTo(15f, 3.47059f, 16.822f, 1.58922f, 20.2237f, 2.08242f)
        curveTo(20.6819f, 2.14885f, 21f, 2.55824f, 21f, 3.02124f)
        verticalLineTo(9.49465f)
        curveTo(21f, 10.1407f, 20.3935f, 10.6121f, 19.7499f, 10.5572f)
        curveTo(16.6531f, 10.293f, 15f, 12f, 15f, 12f)
        curveTo(15f, 12f, 13.3469f, 10.293f, 10.2501f, 10.5572f)
        curveTo(9.60646f, 10.6121f, 9f, 10.1407f, 9f, 9.49465f)
        verticalLineTo(3.02124f)
        curveTo(9f, 2.55824f, 9.3181f, 2.14885f, 9.77631f, 2.08242f)
        }
        }.build()

        return _onlineLearning04!!
    }

private var _onlineLearning04: ImageVector? = null
