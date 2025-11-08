package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Punch: ImageVector
    get() {
        if (_punch != null) {
            return _punch!!
        }
        _punch = ImageVector.Builder(
            name = "Punch",
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
        moveTo(6.6f, 13.7821f)
        verticalLineTo(11.5f)
        moveTo(6.6f, 13.7821f)
        curveTo(6.6f, 14.7644f, 5.79411f, 15.5607f, 4.8f, 15.5607f)
        curveTo(3.80589f, 15.5607f, 3f, 14.7644f, 3f, 13.7821f)
        verticalLineTo(13f)
        curveTo(3f, 9.25027f, 3f, 7.3754f, 3.95491f, 6.06107f)
        curveTo(4.26331f, 5.6366f, 4.6366f, 5.26331f, 5.06107f, 4.95491f)
        curveTo(6.3754f, 4f, 8.25027f, 4f, 12f, 4f)
        curveTo(15.7497f, 4f, 17.6246f, 4f, 18.9389f, 4.95491f)
        curveTo(19.3634f, 5.26331f, 19.7367f, 5.6366f, 20.0451f, 6.06107f)
        curveTo(21f, 7.3754f, 21f, 9.26015f, 21f, 13.0296f)
        curveTo(21f, 14.5561f, 21f, 15.3193f, 20.8431f, 15.9483f)
        curveTo(20.3627f, 17.8739f, 18.8411f, 19.3774f, 16.8923f, 19.8521f)
        curveTo(16.4854f, 19.9512f, 15.7827f, 19.9869f, 14.9252f, 19.9998f)
        curveTo(14.0788f, 19.9998f, 13.35f, 20.0759f, 13.35f, 18.9998f)
        curveTo(13.35f, 17.9839f, 13.6769f, 16.8946f, 14.925f, 16.8946f)
        horizontalLineTo(15.6f)
        moveTo(6.6f, 13.7821f)
        verticalLineTo(15.116f)
        curveTo(6.6f, 16.0983f, 7.40589f, 16.8946f, 8.4f, 16.8946f)
        curveTo(9.39411f, 16.8946f, 10.2f, 16.0983f, 10.2f, 15.116f)
        moveTo(10.2f, 15.116f)
        verticalLineTo(11.1143f)
        moveTo(10.2f, 15.116f)
        verticalLineTo(15.9123f)
        curveTo(10.2f, 16.8946f, 11.0059f, 17.6909f, 12f, 17.6909f)
        curveTo(12.9941f, 17.6909f, 13.8f, 16.8946f, 13.8f, 15.9123f)
        verticalLineTo(15.116f)
        moveTo(17.4f, 11.5f)
        verticalLineTo(15.116f)
        curveTo(17.4f, 16.0983f, 16.5941f, 16.8946f, 15.6f, 16.8946f)
        moveTo(13.8f, 15.116f)
        verticalLineTo(11.1143f)
        moveTo(13.8f, 15.116f)
        curveTo(13.8f, 16.0983f, 14.6059f, 16.8946f, 15.6f, 16.8946f)
        }
        }.build()

        return _punch!!
    }

private var _punch: ImageVector? = null
