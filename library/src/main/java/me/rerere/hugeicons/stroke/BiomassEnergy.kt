package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BiomassEnergy: ImageVector
    get() {
        if (_biomassEnergy != null) {
            return _biomassEnergy!!
        }
        _biomassEnergy = ImageVector.Builder(
            name = "BiomassEnergy",
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
        moveTo(20f, 14.4986f)
        curveTo(20f, 18.6415f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 18.6415f, 4f, 14.4986f)
        lineTo(4f, 14.2794f)
        curveTo(4f, 13.5451f, 4f, 13.178f, 4.25365f, 13.0433f)
        curveTo(4.80339f, 12.7515f, 6f, 14f, 6f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9.50139f)
        curveTo(4f, 5.35849f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 5.35849f, 20f, 9.50139f)
        verticalLineTo(9.72063f)
        curveTo(20f, 10.4549f, 20f, 10.822f, 19.7463f, 10.9567f)
        curveTo(19.1966f, 11.2485f, 18f, 10f, 18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9796f, 11.1605f)
        curveTo(11.2601f, 12.5841f, 10.7346f, 14.8928f, 11.5622f, 17.5f)
        moveTo(11.1431f, 15.0283f)
        curveTo(6.89727f, 12.0079f, 9.81401f, 8.53376f, 12.5599f, 6.78017f)
        curveTo(12.8913f, 6.56855f, 13.057f, 6.46274f, 13.2499f, 6.5119f)
        curveTo(13.4428f, 6.56106f, 13.5355f, 6.73406f, 13.7209f, 7.08005f)
        curveTo(15.2623f, 9.95702f, 16.3667f, 14.4893f, 11.1431f, 15.0283f)
        }
        }.build()

        return _biomassEnergy!!
    }

private var _biomassEnergy: ImageVector? = null
