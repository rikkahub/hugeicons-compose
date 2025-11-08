package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Archer: ImageVector
    get() {
        if (_archer != null) {
            return _archer!!
        }
        _archer = ImageVector.Builder(
            name = "Archer",
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
        moveTo(11f, 17.0294f)
        lineTo(20f, 21f)
        curveTo(19.4444f, 20.4444f, 18.4898f, 18.6435f, 19.1158f, 15.8842f)
        curveTo(19.8982f, 12.4351f, 21.3667f, 8.96668f, 15.9368f, 7.06317f)
        curveTo(14.0333f, 1.63335f, 10.5649f, 3.10176f, 7.11578f, 3.88422f)
        curveTo(4.35649f, 4.51018f, 2.55556f, 3.55556f, 2f, 3f)
        lineTo(6f, 12.0741f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        horizontalLineTo(2f)
        lineTo(5f, 15f)
        horizontalLineTo(8f)
        verticalLineTo(18f)
        lineTo(5f, 21f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        lineTo(20f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 3f)
        horizontalLineTo(19f)
        curveTo(19.4714f, 3f, 19.7071f, 3f, 19.8536f, 3.14645f)
        curveTo(20f, 3.29289f, 20f, 3.5286f, 20f, 4f)
        verticalLineTo(6f)
        }
        }.build()

        return _archer!!
    }

private var _archer: ImageVector? = null
